import React from "react";

const ObjectComparison = ({ oldObj, newObj }) => {
  // Function to compare objects and return a diff object
  const compareObjects = (oldObj, newObj) => {
    const diff = {};
    for (const key in newObj) {
      if (oldObj[key] !== newObj[key]) {
        diff[key] = true;
      }
    }
    return diff;
  };

  const diff = compareObjects(oldObj, newObj);

  return (
    <table border="1" style={{ width: "100%", borderCollapse: "collapse" }}>
      <thead>
        <tr>
          {Object.keys({ ...oldObj, ...newObj }).map((key) => (
            <th key={key}>{key}</th>
          ))}
        </tr>
      </thead>
      <tbody>
        <tr>
          {Object.keys({ ...oldObj, ...newObj }).map((key, index) => (
            <td key={index} style={{ color: diff[key] ? "orange" : "black" }}>
              {oldObj[key] !== undefined ? oldObj[key] : "N/A"}
            </td>
          ))}
        </tr>
        <tr>
          {Object.keys({ ...oldObj, ...newObj }).map((key, index) => (
            <td key={index} style={{ color: diff[key] ? "orange" : "black" }}>
              {newObj[key] !== undefined ? newObj[key] : "N/A"}
            </td>
          ))}
        </tr>
      </tbody>
    </table>
  );
};

// Example usage
const oldObj = {
  name: "Alice",
  age: 25,
  city: "New York",
};

const newObj = {
  name: "Alice",
  age: 30,
  city: "San Francisco",
};

function App() {
  return (
    <div className="App">
      <ObjectComparison oldObj={oldObj} newObj={newObj} />
    </div>
  );
}

export default App;
