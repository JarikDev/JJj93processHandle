package com;

import sun.java2d.loops.ProcessPath;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Process process = Runtime.getRuntime().exec("sleep 1h");
        System.out.println("current process id: " + ProcessHandle.current().getPid());
        System.out.println("sleeper id: " + sleeper.getPid());

        ProcessHandle processHandle = ProcessHandle.of(sleeper.getPid()).orElseThrow(IllegalAccessExeption::new);
        processHandle.onExit().thenRun(() -> System.out.println("process has been closed"));
        System.out.println(processHandle.info().user().orElse("no users"));
        System.out.println(processHandle.info().commandLine().orElse("no users"));
        processHandle.destroy();
        Thread.sleep(100);

    }
}
