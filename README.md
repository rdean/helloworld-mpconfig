# Hello World

* *Author:* Robert Dean
* *Purpose:* Demonstrate the use of MicroProfile Config API with an application deployable to WebSphere Application Server V9 Traditional.

## System Requirements

* *Server:* WebSphere Application Server V9
* *JDK:* IBM JDK 8 8.0.5.x
* *Development:* Maven or Eclipse IDE with M2E

## Getting Started

```bash
git clone https://github.com/rdean/helloworld-mpconfig.git
mvn clean install
``` 

## Deploying the Application

1. Start the WAS server.
1. Deploy the application to the running server.

## Testing

* Navigate to [injection endpoint](https://localhost:9443/hw/api/v1/greeting/injected) to show how the example behaves when the configuration is injected using CDI.
* Navigate to [lookup endpoint](https://localhost:9443/hw/api/v1/greeting/lookup) to show how the example behaves when the configuration is looked up using the MicroProfile `ConfigProvider`.

* *Success:* `Hello, MicroProfile World!`
* *Failure:* `Hello, Non-Config World!`

## Notes

* If using Eclipse, the workbench must be run using at Java 8 runtime.  Using Java 9 or newer will result in failures trying to connect to the administrative ports.

