![\[RichFaces Project Logo](https://albfernandez.github.io/richfaces/rf_logo.png)


# JSF component framework

> The RichFaces project is an advanced UI component framework for easily integrating Ajax capabilities into business applications using JSF. Richfaces is distributed under LGPL v2.1.

> **This is a fork of the unmaintained Richfaces 4.5**. Richfaces End of Life was June 2016. [more info about Richfaces End of Life](https://developer.jboss.org/wiki/RichFacesEnd-Of-LifeQuestionsAnswers)

## Project Info


-   [Original Project Site](http://richfaces.org)

-   [Documentation](https://albfernandez.github.io/richfaces/docs/)

-   [Issue Tracker](https://github.com/albfernandez/richfaces/issues)


## Getting Started

To use the RichFaces framework in your JSF maven application, simply add the following dependency to your `pom.xml` file:

```xml
<dependency>
    <groupId>com.github.albfernandez.richfaces</groupId>
    <artifactId>richfaces</artifactId>
    <version>4.6.20.ayg</version>
</dependency>
```
Prior releases of RichFaces required using a BOM to manage the project dependencies. With RichFaces 4.5 all required dependencies are managed transitively, simplifying your project setup.

Alternatively, if you are not using maven, you can download the project ZIP distribution from the [Download Page](https://github.com/albfernandez/richfaces/releases) and manually include the dependencies in your classpath.

Once you have included the RichFaces dependency in your application, you can start developing by adding a JSF page which includes the RichFaces taglib references:

```html
<!DOCTYPE html>
<html lang="en"
    xmlns="http://www.w3.org/1999/xhtml"
    ...
    xmlns:rich="http://richfaces.org/rich"
    xmlns:a4j="http://richfaces.org/a4j">

</html>
```
For more information on how to get started with the project, see the [project documentation](http://docs.jboss.org/richfaces/).

## Building the Project

### Clone the Project

    $ git clone git@github.albfernandez/richfaces.git

### Prerequsities:

-   JDK 1.8

-   Maven 3.2.0

### Supported Browsers

This is a fork with no time for testing, but it should work in this browsers:

-   IE 11

-   Edge

-   Firefox (52+)

-   Chrome (49+)

### Build the project

Build the project on the command line:

    $ mvn clean install

Maven will build the project and execute the unit tests, but it won’t build the distribution archive nor execute the integration tests.

The freshly built RichFaces artifacts will now be available in your local maven repo, and can be included in your application (using a `-SNAPSHOT` dependency version).

### Building Project Distribution Archive

If you are not using maven in your application, you can build the complete distribution archive using the command:

    $ mvn clean install -Prelease

The generated ZIP distribution file will be placed in the `dist/target/` folder. This zip file contains both the required and optional libraries to be included in your RichFaces-based application.

## Contributing to the project

Details on contributing to the project are available in the [Contributing guide](CONTRIBUTING.md).

### How to Explore the Sources

All the sources related to RichFaces framework and component library are located in the `core` and `components` folders:

-   `src/main/java`

    -   framework sources

    -   JSF components under `org.richfaces.components` package

-   `src/main/resources/META-INF/resources`

    -   JavaScript and CSS resources

Examples such as **RichFaces Showcase** and **Components Demo** are stored in the `examples` folder.

### Developing the Project in an IDE

Once you have [built the project](#building-the-project) you can import `core`, `components` and one of the `examples` to the IDE.

If you are using Eclipse, you should use `Import Existing Maven Project` option.

### How to Test the Project

RichFaces has extensive framework test suite which validates compatibility with various browsers and application servers.

For more information on how to run and develop this test suite, see [Framework Tests](https://github.com/albfernandez/richfaces/blob/master/TESTS.md) document.

### Running Smoke Tests

Note for Debian users, you must `export OPENSSL_CONF=/etc/ssl/` before in order to run

In order to effectively test the project with each code modification, you need to run at least framework’s smoke tests:

    $ mvn clean install -Dintegration=wildfly81 -Dsmoke

This will download WildFly and run the project tests against a managed instance of WildFly 8.1 using a headless Chrome browser.
For a detailed explanation of additional testing configurations and options, refer to the [Testing guide](TESTS.md).


### Building showcase

    $ cd examples/showcase
    $ mvn clean package -Pjee6
