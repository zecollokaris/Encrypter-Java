#                                                   ENCRYPTER

## DESCRIPTION

A Caesar cipher is a type of substitution in which each letter is shifted a certain number of places also known as a key, down the alphabet.  For example, with a shift of 1, A would be replaced by B, B would become C, and so on. For more information on it, you can check this out ```https://en.wikipedia.org/wiki/Caesar_cipher```.

## THE PROBLEM

Implement a Caesar cipher, both encoding, and decoding. The key is an integer from 1 to 25. This cipher rotates the letters of the alphabet (A to Z). The encoding replaces each letter with the 1st to 25th next letter in the alphabet (wrapping Z to A). So key 2 encrypts "HI" to "JK", but key 20 encrypts "HI" to "BC".

