#!/bin/bash

now rm $(now ls|grep "xxxbot-"|cut -d" " -f2)
