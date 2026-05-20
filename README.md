# neasaa-base-app

## Setup

### Prerequisite

Java 17 or higher must be installed on your machine.

Verify your Java version:

```bash
java -version
```

The output should show version 17 or higher, e.g.:
```
openjdk version "17.0.x" ...
```

### Step 1: Clone the Repository

Create the recommended project folder and clone the repository:

```bash
mkdir -p ~/projects/neasaa
cd ~/projects/neasaa
git clone https://github.com/vijaygarry/neasaa-base-app.git neasaa-base-app
cd neasaa-base-app
```

### Step 2: Build

Run the Gradle build:

```bash
./gradlew build
```

On Windows:

```bash
gradlew.bat build
```

### Step 3: Import into IntelliJ IDEA

1. Open IntelliJ IDEA.
2. On the Welcome screen, click **Open** (or go to **File > Open** if a project is already open).
3. Navigate to `~/projects/neasaa/neasaa-base-app`, select `settings.gradle`, and click **Open**. When prompted, select **Open as Project**.
4. Wait for IntelliJ to finish indexing and downloading dependencies — progress is shown in the bottom status bar.
5. Set the Project SDK to Java 17+:
   - Go to **File > Project Structure > Project**.
   - Under **SDK**, select your Java 17 (or higher) installation. If not listed, click **Add SDK > JDK** and point it to your JDK home directory.
   - Click **OK**.
6. Verify the import by opening the **Gradle** tool window (**View > Tool Windows > Gradle**) and running the `build` task.
