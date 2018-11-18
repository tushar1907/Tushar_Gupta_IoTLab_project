# Tushar_Gupta_IoTLab_project

For this problem statement, I built a Java based web-microservices API[Backend] for Car Tracker Sensor. To simulate the sensor readings we will be provided with a mocker service LINK: http://mocker.ennate.academy/. This service will send will mock the sensor request
and will send HTTP PUT and HTTP GET request to the API

## Getting Started

* Setup spring boot project with H2, Web on eclipse.
* Create repository for all the database like alerts , vehicles and readings. 


### Endpoint triggers for help

* Main endpoints
i. Loading vehicle details in bulk via a PUT /vehicles endpoint: http://localhost:8080/vehicles  --> DONE
ii. If the vehicle with same VIN is already present, update the record in db --> DONE
iii. Ingest readings from these vehicles via a POST /readings: http://localhost:8080/readings --> DONE

* Alerts with given priority when following rules are triggered
i. Rule: engineRpm > readlineRpm, Priority: HIGH
ii. Rule: fuelVolume < 10% of maxFuelVolume, Priority: MEDIUM

* Develop REST end points for:
i. Endpoint to fetch details of all the vehicles like VIN, make, model, year etc: localhost:8080/allvehicles  --> DONE
ii. Endpoint to fetch HIGH alerts within last 2 hours for all the vehicles: localhost:8080/allhighalerts  --> DONE
iii. Endpoint to list a vehicle's all historical alerts: localhost:8080/vehiclehistory/<VIN>  --> DONE
