# Weather API

## Overview

The Weather API provides weather forecasts for different cities. It includes two endpoints:

1. `/weather/forecast/{city}`: Get the summary of the weather forecast for a specific city.
2. `/weather/forecast/hourly/{city}`: Get the hourly summary of the weather forecast for a specific city.

## Endpoints

### 1. Get Weather Forecast by City

**Endpoint:**

```
GET /weather/forecast/{city}
```

**Description:**

This endpoint retrieves the summary of the weather forecast for a specific city.

**Parameters:**

- `city` (path variable): The name of the city for which you want the weather forecast.

**Example Request:**

```
GET /weather/forecast/London
```


### 2. Get Hourly Weather Forecast by City

**Endpoint:**

```
GET /weather/forecast/hourly/{city}
```

**Description:**

This endpoint retrieves the hourly summary of the weather forecast for a specific city.

**Parameters:**

- `city` (path variable): The name of the city for which you want the hourly weather forecast.

**Example Request:**

```
GET /weather/forecast/hourly/NewYork
```


## Usage

To use the Weather API, make HTTP requests to the specified endpoints, providing the required parameters in the URL. The responses will contain the relevant weather forecast information.

## Dependencies

- Spring Boot
- Other dependencies as specified in the project's `pom.xml` file.

## Building and Running

To build and run the application locally, follow these steps:

1. Clone the repository: `git clone https://github.com/harmeetsingh7276/weather-api.git`
2. Navigate to the project directory: `cd weather-api`
3. Build the project: `mvn clean install`
4. Run the application: `mvn spring-boot:run`

The application will be accessible at `http://localhost:8080`.