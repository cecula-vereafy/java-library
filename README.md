# Vereafy Java Library

- Introduction
- Initialization
- Completion:
- Retry Cases:
- Get Balance:
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

