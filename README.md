﻿# MlKit Demo

Here you can get the resources for start creating Smart Apps with [MLKit](https://docs.mendix.com/refguide/machine-learning-kit/)
Happy Hacking!

## Getting Started

This app is available in a GitHub repository, therefore you need to enable the [GitHub support](https://docs.mendix.com/refguide/on-premises-git/#preparing-git-support) for Studio Pro First.

Just create a new Mendix App, go to 'Download from Version Control Server', choose 'private server', add this repository git address and there you go!

Please make sure that the bertsquad-12-int8.onnx file is present in the /path/to/your/app/mlsource/bert folder. You can download it from https://shorturl.at/zCEGO if needed.

### Note for Parallell Users
This demo is packed with some computer vision libaries that may require a Virtual Machine restart or two before they are properly recognized


### Training a model

In the [notebooks](notebooks) folder you can find examples on how to create models for later usage.