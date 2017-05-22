## HeadHunters

### Optimization:<br />
- Query State changes to Invalid if Employee client gets hired at a job so that there will not be
  unnecessary contacts made by the Head Hunters Company to any Employer client for every newposted
  job matched with that query.
- Job State changes for the same reason
- Security check in case more than one clients declare the same card number
- If respond is out of time then the state of the Job Index will not change from Failed
- Security check for responses. Any Employer who wants to accept a match index , should have the
  authority to do it and that match index must exist.
- Password at login screen


### INSTRUCTIONS
  * Import Project To eclipse or NetBeans
  * Run Xampp. Start Apache and Mysql
  * Run Login.java
  
 
You can be emploee or employer

employee <br />
 -creates profile and declare your skills<br />
 -After Login can make A question to see if there is a match or to update his/her skills<br />

employer<br />
 -creates profile and posts jobs<br />
 -Can make question if there is a person with the required skills<br />
 -Can post a new Job<br />
 -Can contact a match <br />
 
 
                              ER Model
 ![alt text](https://github.com/tSukulis/HeadHunters/blob/master/ER%20Model.png)
 
                              RD Model
![alt text](https://github.com/tSukulis/HeadHunters/blob/master/RD%20Model.png

 
 
