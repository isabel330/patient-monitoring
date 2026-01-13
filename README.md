# Patient Monitoring Backend Service

In real hospitals, patient monitoring devices (such as heart rate monitors, ECG machines, or temperature sensors) continuously measure vital signs and send data to backend systems.
Then backend services are responsible for:

- Receiving measurement data from devices
- Validating data type
- Recording data to cloud for traceability
- Detecting abnormal values and triggering alerts
- Sending signal and data to doctors

This project implements the backend service layer of such a system. It is implemented using **Java Spring Boot** and deployed on **AWS EC2**.

---

## Functions

This Java service is responsible for:

- Receiving patient measurement data via REST APIs
- Validating input values (e.g. patient ID, temperature limits)
- Generating timestamps and acknowledgements
- Returning structured responses to clients
- Running reliably in a cloud environment (AWS EC2)
- TBC...(database, alerting logic, and real-time dashboards)



