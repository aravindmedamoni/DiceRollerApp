import 'package:flutter/material.dart';
import 'dart:math';

void main() {
  return runApp(
    MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        backgroundColor: Colors.lightBlue[200],
        appBar: AppBar(
          title: Text('Dicee'),
          backgroundColor: Colors.orange,
        ),
        body: DicePage(),
      ),
    ),
  );
}

class DicePage extends StatefulWidget {
  @override
  _DicePageState createState() => _DicePageState();
}

class _DicePageState extends State<DicePage> {

  int leftDiceNumber=3;
  int rightDiceNumber = 2;

  void randomNum(){
    setState(() {
      leftDiceNumber = Random().nextInt(6)+1;
      rightDiceNumber = Random().nextInt(6)+1;

    });
  }
  @override
  Widget build(BuildContext context) {
    return Center(
      child: Row(
        children: <Widget>[
          Expanded(
            child: FlatButton(
              onPressed: (){
                randomNum();
              },
              child: Image.asset(
                  'images/dice$leftDiceNumber.png'
              ),
            ),
          ),
          Expanded(
            child: FlatButton(
              onPressed: (){
              randomNum();
              },
              child: Image.asset(
                  'images/dice$rightDiceNumber.png'
              ),
            ),
          ),
        ],
      ),
    );
  }
}
