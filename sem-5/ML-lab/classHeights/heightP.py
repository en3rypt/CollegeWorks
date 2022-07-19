import pandas as pd
import matplotlib.pyplot as plt
data = pd.read_csv('ClassHeightList.csv')


#box plot
new_data = data[["Heights"]]
plt.figure(figsize = (10, 7))
new_data.boxplot()

#using pandas
#data.boxplot(column=['Heights'],grid=False)


print("Min: ",data.Heights.min())
print("max: ",data.Heights.max())
print("Q1: ",data.Heights.quantile(0.25))
print("Q2: ",data.Heights.quantile(0.5))
print("Q3: ",data.Heights.quantile(0.75))