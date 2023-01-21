Samples from [Snyk Code Checker](https://snyk.io)  tested with [Betterscan.io](https://betterscan.io)

Betterscan engines used:

|Language|Engine|
|---|---|	
|Python|Bandit|
|Javascript|semgrep (nodejsscan)|
|PHP|progpilot|
|Java|PMD, semgrep|
|GO|Gosec|
|c#|insidersec|
|Ruby|Brakeman|

# Summary

Betterscan.io is a Security Automation Software, so any check/software can be added to it (also better than the current ones)

40% of all vulnerabilities were missed by Betterscan.

Betterscan does however so much more, like binary scannig using YARA, SBOM, dependencies vulnerabilities (like Dependabot) etc, adding your own checkers etc.

Please keep in mind actual missing vulnerabilities in real life could be much lower. Those samples were targeted for Snyk Code Checker. Feel free to try with "Goat" projects.


|Amount|Language|
|---|---|	
|0|for Python|
|1| for Javascript|
|1| for PHP|
|3| for Java|
|3| for GO|
|3| for C#|
|1| for Ruby|


Shows findings on the left with Snyk Code and on the right with Betterscan for the same code. 

|Python||
|---|---|	
|Snyk|Betterscan|
|Code Injection|Code Injection|	
|SQL Injection|SQL Injection|
|Open Redirect||
||Bind on all interfaces|

|Javascript||
|---|---|
|Snyk|	Betterscan|
|SQL Injection	|SQL Injection|
|Hardcoded secret	|Hardcoded secret|
|Open Redirect	|Open Redirect
|Insufficied post Message Validation||

|PHP||
|---|---|
|Snyk|	Betterscan|
|Cross-site Scripting (XSS)|	Cross-site Scripting (XSS)|
|SQL Injection|	SQL Injection|
|Open Redirect	|Open Redirect	|
|Use of Hardcoded Credentials	||

|Java||
|---|---|
|Snyk|	Betterscan|
|Cross-site Scripting (XSS)	||
|Improper Neutralization of CRLF Sequences in HTTP Headers	|Improper Neutralization of CRLF Sequences in HTTP Headers|
|Open Redirect	||
|Origin Validation Error||	

|GO||
|---|---|
|Snyk|	Betterscan|
|Cross-site Scripting (XSS)|	Timeouts warning|
|Open Redirect||
|Clear Text Logging||
||Errors not checked|

|C#|	|
|---|---|
|Snyk|	Betterscan|
|Open Redirect||	
|SQL Injection	||
|Cross-site Scripting (XSS)||

|Ruby||
|---|---|	
|Snyk|	Betterscan|
|Open Redirect||	


Command Line (CLI) report

![image](https://user-images.githubusercontent.com/43061739/197542995-51016ace-80d8-4301-902a-b54ade6e00f4.png)




Web Interface

![image](https://user-images.githubusercontent.com/43061739/197459116-89d122cf-9bf2-416b-94cd-ee9e81fe03fd.png)
