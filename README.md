# Babysitter-Kata
This kata was developed in the Eclipse IDE, using Test Driven Development (TDD) methodology. Tests were written to return startTime, stopTime, and 
bedTime. Times were given as integers in 24hr format, ie startTime 1700 (5:00 PM), stopTime 400 (4:00 AM), and bedTime 2100 (9:00 PM).

These times were assumed as fixed, and calculations were made for the different pay rates. Start time to bed time is paid at $12/hr, bed time 
to midnight at $8/hr, and midnight to end of job at $16/hr.

Finally, the total pay was calculated by calling the individual pay methods in the GetTotal method and adding them.
