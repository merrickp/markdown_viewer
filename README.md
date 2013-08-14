# Markdown Viewer

## Overview

This is a simple web application to convert Markdown to HTML that demonstrates using [Lift](http://tristanjuricek.com/knockoff) as a web framework and the [Knockoff](http://tristanjuricek.com/knockoff) library to do the Markdown conversion.

## How to run

1. If not already installed, download and install [sbt](http://www.scala-sbt.org/), a build tool for Java and Scala projects.
    - Follow the [setup](http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html) instructions.

2. If not already installed, download and install [Scala](http://www.scala-lang.org/) version 2.10.
    -You can download Scala from the following [page](http://www.scala-lang.org/download/). Unzip this into a proper directory, and make sure the path to the executable bin/scala is in your system path.

3. Clone the repository: `# git clone git://github.com/merrickp/markdown_viewer.git`.

4. In the root folder of the repository, run sbt: `# sbt`. This will start the build tool.

5. Run the following command in sbt: `> container:start`. This will start the web application on port 8080.

6. Navigate to [http://localhost:8080](http://localhost:8080) to view the converted markdown. It currently shows 1) Output from a hardcoded Markdown string 2) Output from the Markdown located in a hardcoded url. An interactive form will be available in the future.
