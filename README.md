# Vereafy Java Library

- Introduction
- Initialization
- Completion
- Resend
- Get Balance
- Error Responses
----------

## Introduction:

Vereafy is an SMS based 2-factor authentication services that uses machine learning to understand the causes of OTP delivery failures and resolves them instantly to ensure your login and sign up OTPs deliver.

The Vereafy Java Library Project was created to enable java developers integrate seamlessly with the Vereafy API.

To use the Vereafy Java library, you just need to download the Vereafy jar file and add it to the build path/libraries in your IDE. 
----------

## Initialization

 The Vereafy 2fa initialization can be as simple as the following lines of code:

         Vereafy vereafy = new Vereafy("your_APIKEY");
         vereafy.initialization("mobile_number_to_be_verified");

The initialization method returns a response that should look like this:

             {
                "status":"success",
                 "pinRef": 1293488527
             }

## Completion

 The Vereafy 2fa completion can be as simple as the following lines of code:

         Vereafy vereafy = new Vereafy("your_APIKEY");
         vereafy.completion("pinRef","verification_code");

The completion method returns a response that should look like this if the parameters are correct:

             {
                "response":"success"
             }

## Resend

In a case where your app users get impatient and hits the retry link on your app form, just call the resend method this way:
 
         Vereafy vereafy = new Vereafy("your_APIKEY");
         vereafy.resend("mobile_number_to_be_verified","pinRef");

The resend method returns a response that should look like this:

             {
                 "status": "success",
                 "pinRef": 1293488527
             }

## Get Balance

To get your balance on Vereafy, the getbalance method is used this way:
            
            Vereafy vereafy = new Vereafy("your_APIKEY");
            vereafy.getBalance();
The method requires no parameter, and the returned response should look like this:

            {
                 "balance":355
            }

## Error Responses

In a case where the request fails due to one reason or another you should get an error response from the requested endpoint that looks like this:

            {
                "error":"Invalid PIN Ref",
                "code":"CE2000"
            }
            
The table below shows a list of error codes and their descriptions

|  Error Code                   |   Description        |    
|-------------------------------|----------------------|
| CE1001  | Missing Fields            |
| CE1002  | Empty Fields               | 
| CE1006  | Not a Nigerian Number               | 
| CE2000  | Invalid PIN Ref| 
| CE2002  | PIN does not reference any verification request| 
| CE2003  | Mobile number does not match original request| 
| CE2001  | Invalid PIN| 
| CE2004  | Request Not Found               | 
| CE7000  | Verification already succeeded     | 
| CE7001  | Verification already failed      | 
| CE6000  | Insufficient Balance     | 
| CE5000  | Invalid Template ID             | 
| CE5001  | Could not find referenced template                | 
