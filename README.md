# Building and Running the Docker File for Selenium Test


## Steps to Build and Run

1. **Build the Docker Image**  
   Run the following command to build the Docker image:

   ```bash
   docker build -t pos-selenium-test:latest -f posdockerfile .
   ```

2. **Run the Docker Container**
   After building the image, run the following command to start the container

   ```bash
   docker run pos-selenium-test:latest
   ```
