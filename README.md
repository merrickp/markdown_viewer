# Markdown Viewer

## Overview

This is a simple web application to convert Markdown to HTML that demonstrates using [Lift](http://tristanjuricek.com/knockoff) as a web framework and the [Knockoff](http://tristanjuricek.com/knockoff) library to do the Markdown conversion.

## How to run

1. If not already installed, download and install [sbt](http://www.scala-sbt.org/), a build tool for Java and Scala projects.
    - Follow the [setup]((http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html)) instructions.

2. Clone the repository: `# git clone git@github.com:merrickp/markdown_viewer.git`.

3. In the root folder of the repository, run sbt: `# sbt`. This will start the build tool.

4. Run the following command in sbt: `> container:start`. This will start the web application on port 8080.

5. Navigate to http://localhost:8080 to view the result.
