package com.githubactions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MyTestService {

    public void sayHello() {
        log.info("[MyTestService] sayHello");
    }

    /**
     * Starting Gradle build for CodeQL analysis...
     * Welcome to Gradle 8.14.3!
     * Here are the highlights of this release:
     *  - Java 24 support
     *  - GraalVM Native Image toolchain selection
     *  - Enhancements to test reporting
     *  - Build Authoring improvements
     * For more details see https://docs.gradle.org/8.14.3/release-notes.html
     * Starting a Gradle Daemon (subsequent builds will be faster)
     * > Task :compileJava FAILED
     * /home/runner/work/Github-Actions-Practice/Github-Actions-Practice/src/main/java/com/githubactions/MyTestService.java:15: error: not a statement
     *         error...
     *         ^
     * /home/runner/work/Github-Actions-Practice/Github-Actions-Practice/src/main/java/com/githubactions/MyTestService.java:15: error: ';' expected
     *         error...
     * [Incubating] Problems report is available at: file:///home/runner/work/Github-Actions-Practice/Github-Actions-Practice/build/reports/problems/problems-report.html
     * 1 actionable task: 1 executed
     *              ^
     * 2 errors
     * FAILURE: Build failed with an exception.
     * * What went wrong:
     * Execution failed for task ':compileJava'.
     * > Compilation failed; see the compiler output below.
     *   /home/runner/work/Github-Actions-Practice/Github-Actions-Practice/src/main/java/com/githubactions/MyTestService.java:15: error: not a statement
     *           error...
     *           ^
     *   /home/runner/work/Github-Actions-Practice/Github-Actions-Practice/src/main/java/com/githubactions/MyTestService.java:15: error: ';' expected
     *           error...
     *                ^
     *   2 errors
     * * Try:
     * > Check your code and dependencies to fix the compilation error(s)
     * > Run with --scan to get full insights.
     * BUILD FAILED in 13s
     * Error: Process completed with exit code 1.
     * */
    public void error(){
        // CodeQL에서 정상적으로 오류를 잡음
        //error...
    }
}