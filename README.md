#                                                   ENCRYPTER

## DESCRIPTION

An **Encrypter** is a type of substitution in which each letter is shifted a certain number of places also known as a key, down the alphabet.  For example, with a shift of 1, A would be replaced by B, B would become C, and so on. For more information on it, you can check this out ```https://en.wikipedia.org/wiki/Caesar_cipher```.

## THE PROBLEM

Implement: both encoding, and decoding. The key is an integer from 1 to 25. This application rotates the letters of the alphabet (A to Z). The encoding replaces each letter with the 1st to 25th next letter in the alphabet (wrapping Z to A). So key 2 encrypts "HI" to "JK", but key 20 encrypts "HI" to "BC".

## Author

Collins Kariuki

## PRE-REQUISITES.

A couple of things to get you started:

1. 1. Ensure you have [Java](https://java.com/en/download/) installed

A simple way to install Java is using [sdkman](https://sdkman.io/).

Simply follow the instructions to have _sdkman_ installed and install java:

```bash
sdk install java
```

2. [Gradle](https://gradle.org/)

Gradle is used as the build tool and can be installed with sdkman:

```bash
sdk install gradle
```


# **Setup/Installation.**


## Technologies Used

- **[Java](https://java.com/en/download/) - source language.**
- **Gradle for dependency management and running tasks.**
