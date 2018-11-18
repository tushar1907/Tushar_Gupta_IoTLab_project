# Tushar_Gupta_IoTLab_project

For this problem statement, I built a Java based web-microservices API[Backend] for Car Tracker Sensor. To simulate the sensor readings we will be provided with a mocker service LINK: http://mocker.ennate.academy/. This service will send will mock the sensor request
and will send HTTP PUT and HTTP GET request to the API

## Getting Started

* Setup spring boot project with H2, Web on eclipse.
* Create repository for all the database like alerts , vehicles and readings. 


### Endpoint triggers for help

#### Main endpoints
- Loading vehicle details in bulk via a PUT /vehicles endpoint: **http://localhost:8080/vehicles**  --> DONE
- If the vehicle with same VIN is already present, update the record in db --> DONE
- Ingest readings from these vehicles via a POST /readings: **http://localhost:8080/readings** --> DONE

#### Alerts with given priority when following rules are triggered
- Rule: engineRpm > readlineRpm, Priority: HIGH --> DONE
- Rule: fuelVolume < 10% of maxFuelVolume, Priority: MEDIUM --> DONE

#### Develop REST end points for:
- Endpoint to fetch details of all the vehicles like VIN, make, model, year etc: **http://localhost:8080/allvehicles**  --> DONE
- Endpoint to fetch HIGH alerts within last 2 hours for all the vehicles: **http://localhost:8080/allhighalerts**  --> DONE
- Endpoint to list a vehicle's all historical alerts: **http://localhost:8080/vehiclehistory/VIN**  --> DONE
