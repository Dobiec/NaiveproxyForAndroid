# Naiveproxy For Android

A simple application to run naiveproxy on android, using [shizuku](https://github.com/RikkaApps/Shizuku). 



## How it Work

It uses Shizuku to access ADB permissions, and run some simple commands, it copies naive client and `config.json` to `/data/local/tmp` directory to ensure it has sufficient permissions to execute it.



## How to Use

If Shizuku/Sui is not yet activated, please activate it according to the steps first. Please make sure that Shizuku/Sui is activated before proceeding to the next step.

1. Enter the github release page of naiveproxy (You can click on the green text to open the page) and download the naive executable file that matches the current device architecture. 

2. Unzip the naiveproxy.tar.xz to the Download/naiveproxy directory and make sure that the naiveproxy directory contains both the naive and config.json files.

3. Modify the config.json to match your server information.

4. Click the 'Shizuku' button to get the Shizuku permissions.

5. Click the 'Start' button to start the naive client.

Then, you will need another proxy application that supports SOCKS or HTTP proxy, such as Clash, v2rayNG, etc.



## How to Update

It is worth noting that updating this application is not possible with the update of the naive client. If you need to update the naive client, please remove the naive in the naiveproxy directory and download the latest version of the naive client. Then, use the manager to terminate the naiveproxy process and restart the naive using this application.
