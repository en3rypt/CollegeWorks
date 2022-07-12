import pandas as pd

data = pd.read_csv('iris.csv')

cov = data.cov()
corr = data.corr(method = 'pearson')
print('Covariance:',cov)
print("Correlation:",corr)
for i in data.columns:
    
    if i != 'class':
        print(i)
        mean = data[i].mean()
        median = data[i].median()
        std = data[i].std()
        mode = data[i].mode()
        skew = data[i].skew()
        kurt = data[i].kurt()
        


        print("\nMean:", mean, "\nMedian:",median,"\nStandard Deviation:",std,"\nSkewness:",skew,"\nKurtosis:",kurt)
        print("################################################\n\n\n")
