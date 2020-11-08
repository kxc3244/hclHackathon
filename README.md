# hclHackathon

	table for customer
	Object for Customer
	Plan entity
	Application Entity
	Customer Entity
	Document Entity
	Status ENUM
	Status

 	Customer: 
	Name
	Email
	Contact Number
	Address(String)

	Plan:
	Name
	Cost
	Description 

	Application:
	ApplicationID
	Status ENUM
	Comments
	customerID
	PlanID
	DocumentID
	Assigned Phone Number

	Document
	DocumentID
	DocumentName
	URI 
	
	Endpoints:
		
		1. Request from customer: Yousuf
		
			Post Method
			Customer Information
			Document Information 
			Plan Selection
			
			
			Returns: Request ID : Application ID
			
		2. Retrieve Application Status by Customer: Yousuf
			Get Method
			getApplication/{id}
			
		
		3. Get the List of new connection requests (Inprogress, Referback): kala
		
		4. Get the details of selected application {applicationID} :Ram
		
		5. Get the document details {documentID} : Ram
		
		6. Update the application Status {applicationID + StatusID + Comments): Kala
		
		7. Get the list of all available phone numbers: Kevin
		
		8. Update the Assigned phone number to the applicationID {Assigned phone number + Applicaiton ID}: Kevin
			
	
Batch job: Kala
Get the List of new connection requests{Approved}
update the application status Approved status to Connection Enabled



