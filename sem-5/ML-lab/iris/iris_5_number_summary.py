
import pandas as pd
import matplotlib.pyplot as plt
data = pd.read_csv('iris.csv')

# df is your dataframe
data.boxplot(column='sepallength', by='class')

data.boxplot(column='sepalwidth', by='class')

data.boxplot(column='petallength', by='class')

data.boxplot(column='petalwidth', by='class')


# #5number summary
iris_setosa = data.loc[data["class"] == "Iris-setosa"]
iris_versicolor = data.loc[data["class"] == "Iris-versicolor"]
iris_virginica = data.loc[data["class"] == "Iris-virginica"]
datas = [iris_setosa,iris_versicolor,iris_virginica]
for data in datas:
    for i in data:
        if i!= 'class':
            print(i)
            new_data = data[i]
          
            print("Min: ",new_data.min())
            print("max: ",new_data.max())
            print("Q1: ",new_data.quantile(0.25))
            print("Q2: ",new_data.quantile(0.5))
            print("Q3: ",new_data.quantile(0.75))
            print("################################################\n\n\n")