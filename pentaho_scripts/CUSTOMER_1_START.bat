@echo off
cls

SET JAVA_HOME=C:\Program Files\AdoptOpenJDK\jre-8.0.222.10-hotspot
SET PATH=%JAVA_HOME%/bin
ECHO Setting JAVA_HOME: %JAVA_HOME%

C:\Pentaho\Kitchen.bat /file:%CD%\c_1_job.kjb /level:Debug
