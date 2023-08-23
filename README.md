# M.Sai Pavan
## Word Count

[![N|Solid](https://cldup.com/dTxpPi9lDf.thumb.png)](https://nodesource.com/products/nsolid)



Word Count is a api service designed on Spring-boot. It is an excellent service which uses the translator library and helps users to translate words from other languages to english 


## Features
    # AddWord - localhost:8080/api/translate/addWord
- This api takes 2 request parameters: langauage and word
- Note: language should be in shorthand form eg:English-en, Spanish-es
- This method checks if word contains numbers or any special characters
- The response contains the translated word in english


    # getCount - localhost:8080/api/translate/getCount
- This api takes 1 request parameters: word
- Note: word should be in English only
- This method calculates number of times a word in different languages has been added
- The response contains number of occurrence of the word


## Tech

Word Count uses a below of open source frameworks:

- [Spring Boot] - Micro Services!


.

## How to start

Run the WordCountApplication.java file. Application is exposed in port 8080.
Run the API's with required paramters.
