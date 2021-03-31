import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import java.util.stream.Stream;
import static org.testng.AssertJUnit.assertTrue;

public class Main {
    public static void main(String[] args) {
        ProcessHandle self = ProcessHandle.current();
        long PID = self.pid();
        ProcessHandle.Info procInfo = self.info();

        Optional<String[]> arguments = procInfo.arguments();
        Optional<String> cmd =  procInfo.commandLine();
        Optional<Instant> startTime = procInfo.startInstant();
        Optional<Duration> cpuUsage = procInfo.totalCpuDuration();

        System.out.println(PID);

        Stream<ProcessHandle> childProc = ProcessHandle.current().children();
        childProc.forEach(procHandle -> {
            assertTrue("Could not kill process " + procHandle.pid(), procHandle.destroy());
        });
    }
}
