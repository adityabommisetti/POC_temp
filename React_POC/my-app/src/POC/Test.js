import React, { Component } from 'react';
import '../App.css';
import Select from 'react-select';
import CreatableSelect from "react-select/creatable";

class Test extends Component {

  render() {
    const formatOptionLabel1 = () => (
      <div id="testing">"{this.state.selectedCountry}" not found </div>

    )
    return (
      <div className="App">
        <label> Loacation:</label>
        <CreatableSelect
          placeholder="Select a location"
          isClearable
          name="country"
          size="5"
          options={this.props.options}
          width="10px"
          onChange={this.props.handleChange}
          onInputChange={this.props.handleInputChange}
          formatCreateLabel={this.props.selectedCountry !== "" ? this.props.formatOptionLabel : () => false}
          isValidNewOption={this.props.role === "Admin" ? () => true : () => false}
        />
      </div>)
  }
}

export default Test;
