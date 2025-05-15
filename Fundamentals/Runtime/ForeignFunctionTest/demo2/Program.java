import static java.lang.foreign.ValueLayout.*;
import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

class Program {

    @SuppressWarnings("unused")
    private static boolean isFavorite(long num) {
        return (num - 1) % 4 == 0;
    }

    public static void main(String[] args) throws Throwable {
        long m = Long.parseUnsignedLong(args[0]);
        int n = Integer.parseInt(args[1]);
        SymbolLookup primesLibLookup = SymbolLookup.libraryLookup("native/libprimes.so", Arena.global());
        MethodHandle primesFetchHandle = Linker.nativeLinker().downcallHandle(
            primesLibLookup.find("primes_fetch").get(), 
            FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_INT, ADDRESS, ADDRESS)
        );
        MethodHandle isFavoriteHandle = MethodHandles.lookup().unreflect(
            Program.class.getDeclaredMethod("isFavorite", long.class)
        );
        try(Arena arena = Arena.ofConfined()){
            MemorySegment primes = arena.allocate(JAVA_LONG, n);
            if(n <= 5){
                primesFetchHandle.invokeExact(m, n, primes, MemorySegment.NULL);
            }else{
                MemorySegment isFavoriteStub = Linker.nativeLinker().upcallStub(
                    isFavoriteHandle, 
                    FunctionDescriptor.of(JAVA_BOOLEAN, JAVA_LONG), 
                    arena
                );
                primesFetchHandle.invokeExact(m, n, primes, isFavoriteStub);
            }
            for(int i = 0; i < n; ++i)
                System.out.println(primes.getAtIndex(JAVA_LONG, i));
        }
    }
}