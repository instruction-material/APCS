# AP Computer Science A

- Course catalog entry: `/Users/jacobanderson/Sites/classes.jacobdanderson.net/front-end/src/stores/courses/ap-computer-science-a.ts`
- GitHub repo clone: `/Users/jacobanderson/Documents/Work/Juni/instruction-material/APCS`

## Running Java in VS Code on Windows

These steps were tested on Windows in this repo on May 20, 2026. The important pieces are:

- Install a JDK, not just a Java Runtime.
- Install the VS Code Java Extension Pack.
- Open one assignment folder at a time in VS Code when you want to run code.

### 1. Install Java

Open PowerShell and run:

```powershell
winget install --id EclipseAdoptium.Temurin.21.JDK -e --accept-package-agreements --accept-source-agreements
```

This installs Eclipse Temurin JDK 21. On the tested computer, it installed:

```text
C:\Program Files\Eclipse Adoptium\jdk-21.0.11.10-hotspot\
```

After installing, close all PowerShell terminals and all VS Code windows, then reopen them. Windows may not update `PATH` for terminals that
were already open.

### 2. Install the VS Code Java extension

In PowerShell, run:

```powershell
code --install-extension vscjava.vscode-java-pack
```

On the tested computer, this extension pack was already installed.

### 3. Check that Java works

Open a new PowerShell window and run:

```powershell
java -version
javac -version
echo $env:JAVA_HOME
where.exe java
where.exe javac
```

Expected results should look similar to:

```text
openjdk version "21.0.11" 2026-04-21 LTS
javac 21.0.11
JAVA_HOME=C:\Program Files\Eclipse Adoptium\jdk-21.0.11.10-hotspot\
C:\Program Files\Eclipse Adoptium\jdk-21.0.11.10-hotspot\bin\java.exe
C:\Program Files\Eclipse Adoptium\jdk-21.0.11.10-hotspot\bin\javac.exe
```

It is okay if this also appears later in `where.exe java`:

```text
C:\ProgramData\Oracle\Java\javapath\java.exe
```

But the Eclipse Adoptium JDK path should appear first.

### 4. Fix the broken old Oracle Java path if needed

Before the JDK was installed, this computer showed this broken Java error:

```text
Error: opening registry key 'Software\JavaSoft\Java Runtime Environment'
Error: could not find java.dll
Error: Could not find Java SE Runtime Environment.
```

If that still happens after installing the JDK and reopening VS Code, Windows is probably finding the old Oracle Java path first.

To fix it:

1. Open the Windows Start menu.
2. Search for `Environment Variables`.
3. Open `Edit the system environment variables`.
4. Click `Environment Variables...`.
5. Under `System variables`, select `Path`, then click `Edit`.
6. Make sure this JDK path is above the old Oracle path:

```text
C:\Program Files\Eclipse Adoptium\jdk-21.0.11.10-hotspot\bin
```

7. Move this old path lower, or remove it if Java still fails:

```text
C:\ProgramData\Oracle\Java\javapath
```

8. Close and reopen VS Code and PowerShell.

### 5. Run an APCS assignment in VS Code

This repo has many folders with a file named `Main.java`. Most files use the default Java package. Because of that, VS Code works best if
you open one assignment folder at a time instead of opening the whole `APCS` folder when you want to run code.

For example:

```powershell
code .\APCS1-Variables-Reference
```

Then in VS Code:

1. Open `Main.java`.
2. Wait for the Java extension to finish loading.
3. Click `Run` above the `main` method, or use the run triangle in the top-right corner.
4. The program output should appear in the VS Code terminal.

For a different assignment, close that VS Code window and open another folder:

```powershell
code .\APCS-Dog-Class
```

### 6. Run from the terminal

For a folder with only `Main.java`:

```powershell
cd .\APCS1-Variables-Reference
javac Main.java
java Main
```

For a folder with multiple Java files:

```powershell
cd .\APCS-Dog-Class
javac *.java
java Main
```

These were tested successfully in:

- `APCS1-Variables-Reference`
- `APCS-Dog-Class`
- `APCS11-Card-and-Deck-Classes`

### 7. If VS Code still will not run Java

Try these in order:

1. Close every VS Code window and reopen the assignment folder.
2. Check `java -version` and `javac -version` in a new PowerShell window.
3. In VS Code, open the Command Palette with `Ctrl+Shift+P`.
4. Run `Java: Clean Java Language Server Workspace`.
5. Choose to reload/delete the workspace data when VS Code asks.
6. Reopen only the assignment folder you want to run.

